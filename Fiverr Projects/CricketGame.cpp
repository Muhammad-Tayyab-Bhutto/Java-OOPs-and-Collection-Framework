/*
COURSE PROJECT - PROGRAMMING FUNDAMENTALS [SPRING 2022]
*/
#include <iostream>
#include <iomanip>
#include <cstring>
#include <fstream>
#include <cstdlib>
#include <ctime>
#include <math.h>
using namespace std;

int toss(string teamNames[2][2]);
double getEconomyRate(int players[2][11][16], int playerNumber, int teamNumber);
void swapBatsmen(int *onStrikeBatsman, int *offStrikeBatsman);
bool isDismissed(int probability);
void getNextBowlerReady(int players[2][11][16], int teamNumber, int *previousBowler, int maxOvers);
void playNextBall(int players[2][11][16], int batsmanNumber, int bowler, int teamNumber, int maxOvers);
void getBowlersReady(int players[2][11][16], int teamNumber);
void printHeaderLine();
void printNormalLine();
void clearConsole();
int getTotalRuns(int players[2][11][16], int teamNumber);
int getTotalWicketsDismissed(int players[2][11][16], int teamNumber);
int getTotalBallsBowled(int players[2][11][16], int teamNumber);
int getNumberOfOversFromFile(int *overs, char *fileName);
void resetPlayerStats(int players[2][11][16], int nTeams, int nPlayers, int nFlags);
void battingBoard(string playerNames[2][11], int players[2][11][16], int teamNumber);
void bowlingBoard(string playerNames[2][11], int players[2][11][16], int teamNumber);
void inningsScoreboard(string teamNames[2][2], int maxOvers, string playerNames[2][11], int players[2][11][16], int teamNumber, char *fallOfWickets);
int getBatsmenReady(int players[2][11][16], int teamNumber);
void getNextBatsmanReady(int players[2][11][16], int *batsmanNumber, int teamNumber);
bool isAllOut(int players[2][11][16], int teamNumber);
double getStrikeRate(int players[2][11][16], int playerNumber, int teamNumber);
double getTotalRunRate(int players[2][11][16], int teamNumber);
void liveScorecard(string teamNames[2][2], string playerNames[2][11], int players[2][11][16], int battingTeam, int onStrikeBatsman, int offStrikeBatsman, int bowler);

int bowlerOfThematch(int players[2][11][16], string playerNames[2][11])
{
    int mostWicketsTaker = 0;
    int mostWickets = 0;
    int fromTeam = 0;
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 11; j++)
        {
            if (players[i][j][11] > mostWickets)
            {
                mostWickets = players[i][j][11];
                mostWicketsTaker = j;
                fromTeam = i;
            }
        }
    }
    cout << setfill('-') << setw(50) << endl
         //<<"|"<<"Bowler Of The Match: "<<"|\n"
         << "|" << setw(24) << "" << left << setw(24) << playerNames[fromTeam][mostWicketsTaker] << "|\n"
         << setfill('-') << setw(50) << endl;
    return mostWicketsTaker;
}

/*

void saveBowlingBoard();
void saveBattingBoard();
void saveInning

void pause():
  + using cin.get()
void saveFirstInningsToFile()
void saveSecondInningsToFile()
void saveMatchSummaryToFile()
void readMatchDataFromFile();
char* getFallOfWickets();
void jumpToSpecificOver(int)
void printFinalResults();
int getMaidens();
int getBowlerOfTheMatch():
  + mostWicketsTaken
  + leastRunsConceded
int getBatsmanOfTheMatch():
  + mostRunsScored
  +
*/

int main()
{
    const int NUMBER_OF_TEAMS = 2;
    const int NUMBER_OF_PLAYERS = 11;
    const int NUMBER_OF_FLAGS = 16;
    // PLAYERS
    string playerNames[NUMBER_OF_TEAMS][11] = {
        {"Mohammad Rizwan", "Babar Azam", "Fakhar Zaman", "Mohammad Hafeez", "Shoaib Malik", "Asif Ali", "Shadab Khan", "Imad Wasim", "Hasan Ali", "Shaheen Afridi", "Haris Rauf"},
        {"K.L. Rahul", "Rohit Sharma", "Virat Kohli", "Suryakumar Yadav", "Rishab Pant", "Ravindra Jadeja", "Hardik Pandya", "Bhuvneshwar Kumar", "Mohammad Shami", "Jasprit Bumrah", "Varun Chakravarhty"}};
    // TEAMS
    string teamNames[NUMBER_OF_TEAMS][2] = {
        {"PAKISTAN", "PAK"},
        {"INDIA", "IND"}};

    /*
    3D array: [teamNumber][PlayerNumber][Stats]
    STATISTICS:
        [0]hasBatted, where (0,1)=(False,True)
        [1]runs scored
        [2]balls faced
        [3]number of ones
        [4]number of twos
        [5]number of threes
        [6]number of fours
        [13]number of fives
        [7]number of sixes
        [8]balls bowled(overs)
        [9]maidens
        [10]runs given
        [11]wickets taken
        [12]isOut, where (0,1)=(False,True)
        [14]hasBowled, where (0,1)=(False,True)
        [15]isOnStrike, where (0,1)=(False,True)
    */
    int players[NUMBER_OF_TEAMS][NUMBER_OF_PLAYERS][NUMBER_OF_FLAGS];
    char *fallOfWickets = new char[250];
    strcpy(fallOfWickets, "N/A");
    int maxOvers;
    int currentOver = 0;
    bool hasFirstInningsEnded = false;
    bool hasSecondInningsEnded = false;
    int onStrikeBatsman = 0;
    int offStrikeBatsman = 1;
    int bowler = 10;

    resetPlayerStats(players, NUMBER_OF_TEAMS, NUMBER_OF_PLAYERS, NUMBER_OF_FLAGS);
    // MAXIMUM OVERS ARE DECIDED FROM THE FILE
    getNumberOfOversFromFile(&maxOvers, "configuration.txt");

    int battingTeam = toss(teamNames);
    getBatsmenReady(players, battingTeam);
    getBowlersReady(players, (battingTeam + 1) % 2);

    while (!hasFirstInningsEnded)
    {
        int nBallsBowled = getTotalBallsBowled(players, (battingTeam + 1) % 2);
        currentOver = (nBallsBowled / 6);
        if (currentOver == maxOvers || isAllOut(players, battingTeam) == true)
        { // EITHER OVERS COMPLETED OR ALL OUT
            hasFirstInningsEnded = true;
            break;
        }
        liveScorecard(teamNames, playerNames, players, battingTeam, onStrikeBatsman, offStrikeBatsman, bowler);
        // inningsScoreboard(teamNames, maxOvers, playerNames, players, battingTeam, fallOfWickets);
        system("PAUSE");
        system("CLS");
        int runsBeforePlayingTheBall = getTotalRuns(players, battingTeam);
        playNextBall(players, onStrikeBatsman, bowler, battingTeam, maxOvers);
        int runsAfterPlayingTheBall = getTotalRuns(players, battingTeam);
        int runsMadeOnTheBall = runsAfterPlayingTheBall - runsBeforePlayingTheBall;
        if (runsMadeOnTheBall % 2 == 1)
        { // IF ODD RUNS SCORED
            swapBatsmen(&onStrikeBatsman, &offStrikeBatsman);
            players[battingTeam][onStrikeBatsman][15] = 1;
            players[battingTeam][offStrikeBatsman][15] = 0;
        }
        if (players[battingTeam][onStrikeBatsman][12] == 1)
        { // isOut
            getNextBatsmanReady(players, &onStrikeBatsman, battingTeam);
        }
        if (players[(battingTeam + 1) % 2][bowler][8] % 6 == 0)
        { // ballsBowled (over Change, batsmen Change, new Bowler)
            getNextBowlerReady(players, (battingTeam + 1) % 2, &bowler, maxOvers);
            swapBatsmen(&onStrikeBatsman, &offStrikeBatsman);
            players[battingTeam][onStrikeBatsman][15] = 1;
            players[battingTeam][offStrikeBatsman][15] = 0;
        }
    }
    inningsScoreboard(teamNames, maxOvers, playerNames, players, battingTeam, fallOfWickets);
    int targetToChase = getTotalRuns(players, battingTeam);
    cout << "Target: " << targetToChase << endl;
    /*
    while(!hasSecondInningsEnded){
        int nBallsBowled = getTotalBallsBowled(players, battingTeam);
        currentOver = nBallsBowled/6+((nBallsBowled%6)/10.0);
        if(currentOver==maxOvers || getTotalWicketsDismissed(players, 0)==10){
            hasSecondInningsEnded = false;
            break;
        }
        playNextBall(players, onStrikeBatsman, bowler, battingTeam);
    }
    */
    return 0;
}

/*
iomanip library essential functions;
  + setfill(char_type c)
  + setprecision(int n)
  + setw(int n)
  + get_money(moneyT& mon, bool intl=false)
  + put_money(const moneyT& mon, bool intl=false)
  + get_time(struct tm* tmb, const charT* fmt)
  + put_time(const struct tm* tmb, const charT* fmt)
*/

void bowlingBoard(string playerNames[2][11], int players[2][11][16], int teamNumber)
{
    printHeaderLine();
    cout << setfill(' ') << left << setw(50) << "Bowling" << setw(5) << " O " << setw(5) << " M " << setw(5) << " R " << setw(5) << " W "
         << " Econ \n";
    printHeaderLine();
    for (int i = 10; i >= 0; i--)
    {
        if (players[teamNumber][i][14] == 0)
        {
            break;
        }
        int nBallsBowled = players[teamNumber][i][8];
        double nBalls = nBallsBowled / 6 + ((nBallsBowled % 6) / 10.0);
        int nMaidens = players[teamNumber][i][9];
        int nRunsGiven = players[teamNumber][i][10];
        int nWickets = players[teamNumber][i][11];
        double economy = getEconomyRate(players, i, teamNumber);
        cout << " " << setfill(' ') << left << setw(49) << playerNames[teamNumber][i]
             << " " << setw(3) << nBalls << "  " << setw(3) << nMaidens << "  "
             << setw(3) << nRunsGiven << "  " << setw(3) << nWickets << "  "
             << setprecision(3) << setw(8) << economy << endl;
        printNormalLine();
    }
    printHeaderLine();
}
void battingBoard(string playerNames[2][11], int players[2][11][16], int teamNumber)
{
    printHeaderLine();
    cout << setfill(' ') << left << setw(50) << "Batting" << setw(5) << " R " << setw(5) << " B " << setw(5) << " 1s " << setw(5) << " 2s " << setw(5) << " 3s " << setw(5) << " 4s " << setw(5) << " 5s " << setw(6) << " 6s "
         << " S/R\n";
    printHeaderLine();
    int batsmenPlayed = -1;
    for (int i = 0;; i++)
    {
        if (players[teamNumber][i][0] == 0)
        {
            break;
        } // IF PLAYER HAS NOT BATTED YET
        batsmenPlayed++;
        int nRuns = players[teamNumber][i][1];
        int nBalls = players[teamNumber][i][2];
        int nOnes = players[teamNumber][i][3];
        int nTwos = players[teamNumber][i][4];
        int nThrees = players[teamNumber][i][5];
        int nFours = players[teamNumber][i][6];
        int nFives = players[teamNumber][i][13];
        int nSixes = players[teamNumber][i][7];
        double strikeRate = getStrikeRate(players, i, teamNumber);
        cout << "  " << (players[teamNumber][i][15] == 1 ? "> " : "  ") << setfill(' ') << left << setw(32) << playerNames[teamNumber][i] << left << setw(15) << (players[teamNumber][i][12] == 0 ? "NOT OUT" : "OUT")

             << setw(5) << nRuns << setw(5) << nBalls << setw(5) << nOnes
             << setw(5) << nTwos << setw(5) << nThrees << setw(5) << nFours
             << setw(5) << nFives << setw(5) << nSixes
             << setprecision(3) << setw(8) << strikeRate << endl;
        printNormalLine();
    }
    cout << setfill(' ') << left << setw(50) << "Extras"
         << "0 (W 0, LB 0)\n";
    printHeaderLine();
    int totalBallsBowled = getTotalBallsBowled(players, (teamNumber + 1) % 2);
    cout << setfill(' ') << left << setw(50) << "Total runs" << getTotalRuns(players, teamNumber) << " (" << getTotalWicketsDismissed(players, (teamNumber + 1) % 2) << " wkts, " << (totalBallsBowled / 6 + (totalBallsBowled % 6) / 10.0) << " ov)\n";
    printHeaderLine();
    cout << left << setfill(' ') << setw(50) << "Yet to bat"
         << "\n";
    for (int i = batsmenPlayed, n = 1; i < 11; i++, n++)
    {
        if (players[teamNumber][i][0] != 0)
        {
            continue;
        }
        cout << "  " << playerNames[teamNumber][i] << " . " << (n % 6 == 0 ? "\n" : "");
    }
    cout << "\b\b  \n";
    printHeaderLine();
}
void inningsScoreboard(string teamNames[2][2], int maxOvers, string playerNames[2][11], int players[2][11][16], int teamNumber, char *fallOfWickets)
{
    cout << " ^ " << teamNames[teamNumber][0] << " INNINGS (" << maxOvers << " overs maximum)\n";
    battingBoard(playerNames, players, teamNumber);
    cout << setfill(' ') << left << setw(25) << "TOTAL " << maxOvers << " Ov(RR. " << getTotalRunRate(players, teamNumber) << setfill(' ') << left << setw(12) << ")" << getTotalRuns(players, teamNumber) << "/" << getTotalWicketsDismissed(players, (teamNumber + 1) % 2) << "\n";
    printHeaderLine();
    cout << setfill(' ') << left << setw(25) << "Fall of wickets:" << fallOfWickets << "\n\n";
    bowlingBoard(playerNames, players, (teamNumber + 1) % 2);
}
void resetPlayerStats(int players[2][11][16], int nTeams, int nPlayers, int nFlags)
{
    for (int i = 0; i < nTeams; i++)
    {
        for (int j = 0; j < nPlayers; j++)
        {
            for (int k = 0; k < nFlags; k++)
            {
                players[i][j][k] = 0;
            }
        }
    }
}
int getTotalRuns(int players[2][11][16], int teamNumber)
{
    int totalRuns = 0;
    for (int i = 0; i < 11; i++)
    {
        totalRuns += players[teamNumber][i][1];
    }
    return totalRuns;
}
int getTotalWicketsDismissed(int players[2][11][16], int teamNumber)
{
    int totalWickets = 0;
    for (int i = 0; i < 11; i++)
    {
        if (players[teamNumber][i][12] == 1)
        {
            cout << "out...\n";
            totalWickets++;
        }
    }
    return totalWickets;
}
int getTotalBallsBowled(int players[2][11][16], int teamNumber)
{
    int totalBalls = 0;
    for (int i = 0; i < 11; i++)
    {
        totalBalls += players[teamNumber][i][8];
    }
    return totalBalls;
}
void printHeaderLine()
{
    cout << setfill('_') << setw(100) << ""
         << "\n";
}
void printNormalLine()
{
    cout << setfill('-') << setw(100) << ""
         << "\n";
}
void clearConsole()
{
    system("CLS");
}
double getTotalRunRate(int players[2][11][16], int teamNumber)
{
    int totalBalls = getTotalBallsBowled(players, (teamNumber + 1) % 2);
    if (totalBalls == 0)
    {
        return 0.0;
    }
    double totalOvers = totalBalls / 6.0;
    int totalRuns = getTotalRuns(players, teamNumber);
    // cout << "Total Balls: "<<totalBalls<<"\tTotal Overs: "<<totalOvers<<"\tTotal Runs: "<<totalRuns<<endl;
    return totalRuns / totalOvers;
}
int getNumberOfOversFromFile(int *overs, char *fileName)
{
    fstream oversDecidingFile(fileName);
    oversDecidingFile >> *overs;
    oversDecidingFile.close();
}
int getBatsmenReady(int players[2][11][16], int teamNumber)
{
    players[teamNumber][0][0] = 1;
    players[teamNumber][1][0] = 1;
    return 0; // PLAYER#1
}
void getNextBatsmanReady(int players[2][11][16], int *batsmanNumber, int teamNumber)
{
    players[teamNumber][*batsmanNumber][15] = 0; // isOnStrike
    for (int i = 0; i < 11; i++)
    {
        if (players[teamNumber][i][0] == 0)
        {
            players[teamNumber][i][0] = 1; // hasBatted
            *batsmanNumber = i;
            players[teamNumber][*batsmanNumber][15] = 1; // isOnStrike
            return;
        }
    }
}
double getStrikeRate(int players[2][11][16], int playerNumber, int teamNumber)
{
    if (players[teamNumber][playerNumber][2] <= 0)
    {
        return 0.0;
    }
    return (players[teamNumber][playerNumber][1] / (double)players[teamNumber][playerNumber][2]) * 100;
}
double getEconomyRate(int players[2][11][16], int playerNumber, int teamNumber)
{
    if (players[teamNumber][playerNumber][8] <= 0)
    {
        return 0.0;
    }
    double oversBowled = players[teamNumber][playerNumber][8] / 6.0;
    int runsConceded = players[teamNumber][playerNumber][10];
    return (runsConceded / oversBowled);
}
bool isDismissed(int probability)
{
    srand(time(0));
    return (rand() % 100 < probability);
}
void getNextBowlerReady(int players[2][11][16], int teamNumber, int *previousBowler, int maxOvers)
{
    int oversPerBowler = ceil(maxOvers / 5);
    for (int i = 10; i >= 0; i--)
    {
        if (i == *previousBowler)
        {
            int beforeBowler = (i - 1 < 5 ? 10 : i - 1);
            int afterBowler = (i + 1 > 10 ? 5 : i + 1);
            if (players[teamNumber][beforeBowler][8] <= players[teamNumber][afterBowler][8])
            {
                players[teamNumber][beforeBowler][14] = 1;
                *previousBowler = beforeBowler;
                return;
            }
            else
            {
                players[teamNumber][afterBowler][14] = 1;
                *previousBowler = afterBowler;
                return;
            }
        }
    }
}
void swapBatsmen(int *onStrikeBatsman, int *offStrikeBatsman)
{
    *onStrikeBatsman += *offStrikeBatsman;
    *offStrikeBatsman = *onStrikeBatsman - *offStrikeBatsman;
    *onStrikeBatsman -= *offStrikeBatsman;
}
bool isAllOut(int players[2][11][16], int teamNumber)
{
    int totalDismissedPlayersCount = 0;
    for (int i = 0; i < 11; i++)
    {
        if (players[teamNumber][i][12] == 1)
        {
            totalDismissedPlayersCount++;
        }
    }
    return (totalDismissedPlayersCount == 10);
}
void playNextBall(int players[2][11][16], int batsmanNumber, int bowler, int teamNumber, int maxOvers)
{
    srand(time(0));
    players[teamNumber][batsmanNumber][15] = 1;    // isOnStrike
    players[(teamNumber + 1) % 2][bowler][8] += 1; // ballsBowled
    players[teamNumber][batsmanNumber][2] += 1;    // ballsFaced
    bool isBowler = batsmanNumber > 5;
    if (isDismissed(isBowler ? 50 : 10) == 1)
    {
        players[teamNumber][batsmanNumber][12] = 1;     // isOut
        players[(teamNumber + 1) % 2][bowler][11] += 1; // wicketsTaken
    }
    else
    {
        int runsMadeOnTheBall = rand() % 7;
        switch (runsMadeOnTheBall)
        {
        case 0:
            break;
        case 1:
            players[teamNumber][batsmanNumber][3] += 1; // number of ones
            break;
        case 2:
            players[teamNumber][batsmanNumber][4] += 1; // number of twos
            break;
        case 3:
            players[teamNumber][batsmanNumber][5] += 1; // number of threes
            break;
        case 4:
            players[teamNumber][batsmanNumber][6] += 1; // number of fours
            break;
        case 5:
            players[teamNumber][batsmanNumber][13] += 1; // number of fives
            break;
        case 6:
            players[teamNumber][batsmanNumber][7] += 1; // number of sixes
            break;
        }
        players[teamNumber][batsmanNumber][1] += runsMadeOnTheBall;     // TotalRunsScoredByBatsman
        players[(teamNumber + 1) % 2][bowler][10] += runsMadeOnTheBall; // TotalRunsConcededByBowler
    }
}
void getBowlersReady(int players[2][11][16], int teamNumber)
{
    players[teamNumber][10][14] = 1;
}
int toss(string teamNames[2][2])
{
    srand(time(0));
    int randomTeam = rand() % 2;
    cout << "Toss: " << teamNames[randomTeam][0] << " won the toss and decided to BAT\n";
    system("pause");
    return randomTeam;
}
void liveScorecard(string teamNames[2][2], string playerNames[2][11], int players[2][11][16], int battingTeam, int onStrikeBatsman, int offStrikeBatsman, int bowler)
{
    int bowlingTeam = (battingTeam + 1) % 2;
    int teamMadeRuns = getTotalRuns(players, battingTeam);
    int teamDismissedWickets = getTotalWicketsDismissed(players, battingTeam);
    string battingTeamName = teamNames[battingTeam][1];
    string bowlingTeamName = teamNames[bowlingTeam][1];
    string onStrikeBatsmanName = playerNames[battingTeam][onStrikeBatsman];
    string offStrikeBatsmanName = playerNames[battingTeam][offStrikeBatsman];
    string bowlerName = playerNames[bowlingTeam][bowler];
    int onStrikeBatsmanRuns = players[battingTeam][onStrikeBatsman][1];
    int onStrikeBatsmanBallsFaced = players[battingTeam][onStrikeBatsman][2];
    int offStrikeBatsmanRuns = players[battingTeam][offStrikeBatsman][1];
    int offStrikeBatsmanBallsFaced = players[battingTeam][offStrikeBatsman][2];
    int bowlerTakenWickets = players[bowlingTeam][bowler][11];
    int bowlerRunsConceded = players[bowlingTeam][bowler][10];
    int ballsPlayed = players[bowlingTeam][bowler][8];
    double bowlerBowledBalls = ballsPlayed / 6 + (ballsPlayed % 6) / 10.0;
    ballsPlayed = getTotalBallsBowled(players, bowlingTeam);
    double teamPlayedBalls = ballsPlayed / 6 + (ballsPlayed % 6) / 10.0;
    cout << right << setw(6) << "|" << setw(9) << ""
         << "| " << left << setw(20) << onStrikeBatsmanName << "| " << left << setw(20) << offStrikeBatsmanName << "| " << left << setw(20) << bowlerName << right << setw(2) << bowlerTakenWickets << "-" << left << setw(3) << bowlerRunsConceded << " " << setw(5) << bowlerBowledBalls << "|" << endl
         << right << setw(4) << battingTeamName << " |" << right << setw(5) << teamMadeRuns << "-" << left << setw(3) << teamDismissedWickets << "| " << setw(20) << ""
         << "| " << setw(20) << ""
         << "| " << setw(32) << ""
         << "| " << left << bowlingTeamName << endl
         << right << setw(6) << "|" << right << setw(8) << teamPlayedBalls << " | " << setw(5) << "" << right << setw(5) << onStrikeBatsmanRuns << " (" << right << setw(3) << onStrikeBatsmanBallsFaced << ")" << setw(4) << ""
         << "| " << setw(5) << "" << right << setw(5) << offStrikeBatsmanRuns << " (" << right << setw(3) << offStrikeBatsmanBallsFaced << ")" << setw(4) << ""
         << "| " << left << setw(32) << ""
         << "| " << endl;
}
