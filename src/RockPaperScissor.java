import java.util.Random;

public class RockPaperScissor {
    public static final String[] computerChoices = {"Rock", "Paper", "Scissors"};

    private String computerChoice;
    private int computerScore, playerScore;

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }


    private final Random random;

    public RockPaperScissor() {
        random = new Random();
    }

    public String playRockPaperScissor(String playerChoice) {
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        String result;

        if (computerChoice.equals("Rock")) {
            if (playerChoice.equals("Paper")) {
                result = "Player Wins";
                playerScore++;
            } else if (playerChoice.equals("Scissors")) {
                result = "Computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }
        } else if (computerChoice.equals("Paper")) {
            if (playerChoice.equals("Scissors")) {
                result = "Player Wins";
                playerScore++;
            } else if (playerChoice.equals("Rock")) {
                result = "Computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }
        } else {
            if (computerChoice.equals("Scissors")) {
                if (playerChoice.equals("Rock")) {
                    result = "Player Wins";
                    playerScore++;
                } else if (playerChoice.equals("Paper")) {
                    result = "Computer Wins";
                    computerScore++;
                } else {
                    result = "Draw";
                }
            } else {
                result = "";
            }
        }
        return result;
    }
}
