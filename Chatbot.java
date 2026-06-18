import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Rule-Based AI Chatbot
 * Decode Labs AI Internship - Project 1
 * Author: [Your Name]
 */

public class Chatbot {

    // Method to get response based on user input
    public static String getResponse(String userInput) {
        String input = userInput.toLowerCase().trim();

        // --- Greetings ---
        if (input.equals("hi") || input.equals("hello") || input.equals("hey") ||
            input.equals("howdy") || input.equals("what's up") || input.equals("sup")) {
            return "Hello! I'm DecodeBot, your AI assistant. How can I help you today?";
        }

        else if (input.equals("good morning")) {
            return "Good morning! Hope you're having a great day! How can I assist you?";
        }

        else if (input.equals("good evening") || input.equals("good night")) {
            return "Good evening! Hope your day went well. What can I do for you?";
        }

        // --- Bot Identity ---
        else if (input.contains("your name") || input.contains("who are you")) {
            return "I'm DecodeBot - a rule-based AI chatbot built for Decode Labs AI Internship Project 1!";
        }

        else if (input.contains("how are you") || input.contains("how r u")) {
            return "I'm doing great, thanks for asking! I'm always ready to chat. How about you?";
        }

        // --- AI & Tech Topics ---
        else if (input.contains("what is ai") || input.contains("artificial intelligence")) {
            return "Artificial Intelligence (AI) is the simulation of human intelligence by machines.\n" +
                   "It includes Machine Learning, Deep Learning, NLP, and Computer Vision.\n" +
                   "You are learning it right now at Decode Labs - great choice!";
        }

        else if (input.contains("machine learning") || input.equals("ml")) {
            return "Machine Learning (ML) is a subset of AI where systems learn from data.\n" +
                   "Instead of being explicitly programmed, ML models find patterns automatically.\n" +
                   "Types: Supervised, Unsupervised, and Reinforcement Learning.";
        }

        else if (input.contains("deep learning") || input.contains("neural network")) {
            return "Deep Learning uses neural networks with many layers (hence 'deep').\n" +
                   "It powers image recognition, speech synthesis, and ChatGPT-like models.\n" +
                   "It's inspired by how the human brain processes information!";
        }

        else if (input.contains("java")) {
            return "Java is a powerful, object-oriented programming language!\n" +
                   "It follows the principle: Write Once, Run Anywhere.\n" +
                   "It's widely used in backend systems, Android apps, and enterprise software!";
        }

        else if (input.contains("python")) {
            return "Python is the #1 language for AI and Data Science!\n" +
                   "Libraries like NumPy, Pandas, TensorFlow make it very powerful.\n" +
                   "Both Java and Python are great languages to know!";
        }

        else if (input.contains("chatbot") || input.contains("rule based")) {
            return "A rule-based chatbot uses if-else logic to match user inputs and return responses.\n" +
                   "It is the simplest form of AI conversation - no training data needed!\n" +
                   "This is exactly what you are building for Decode Labs Project 1!";
        }

        // --- Decode Labs ---
        else if (input.contains("decode labs") || input.contains("internship")) {
            return "Decode Labs offers amazing internships in AI, Data Science, and more!\n" +
                   "You are currently working on Project 1: Rule-Based AI Chatbot.\n" +
                   "Keep it up - you are doing awesome!";
        }

        else if (input.contains("project")) {
            return "Your current project is a Rule-Based AI Chatbot!\n" +
                   "Key features: greetings, if-else logic, continuous loop.\n" +
                   "This covers control flow, decision-making, and basic AI concepts!";
        }

        // --- Help ---
        else if (input.contains("help") || input.contains("what can you do")) {
            return "Here's what I can help you with:\n" +
                   "  - Greetings and small talk\n" +
                   "  - AI, ML, Deep Learning concepts\n" +
                   "  - Java and Python programming\n" +
                   "  - Info about Decode Labs and your project\n" +
                   "  - General questions\n" +
                   "Just type something and I'll do my best!";
        }

        // --- Fun ---
        else if (input.contains("joke") || input.contains("funny")) {
            return "Why do Java developers wear glasses?\n" +
                   "Because they don't C# ! Ha ha!";
        }

        else if (input.contains("fact")) {
            return "Fun AI Fact: The term 'Artificial Intelligence' was coined by John McCarthy in 1956!\n" +
                   "He organized the first AI conference at Dartmouth College that same year.";
        }

        else if (input.contains("time")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
            return "The current time is: " + LocalDateTime.now().format(formatter);
        }

        else if (input.contains("date") || input.contains("today")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
            return "Today is: " + LocalDateTime.now().format(formatter);
        }

        else if (input.contains("thank")) {
            return "You're welcome! Happy to help. Feel free to ask anything else!";
        }

        // --- Exit ---
        else if (input.equals("bye") || input.equals("goodbye") || input.equals("exit") ||
                 input.equals("quit") || input.equals("see you") || input.equals("cya")) {
            return "EXIT";
        }

        // --- Unknown input ---
        else {
            return "Hmm, I didn't quite understand that.\n" +
                   "Try asking about AI, Java, your project, or type 'help' to see what I can do!";
        }
    }

    // Main method - continuous loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("        Welcome to DecodeBot!");
        System.out.println("   Decode Labs AI Internship - Project 1");
        System.out.println("==================================================");
        System.out.println("   Type 'help' for options  |  Type 'bye' to exit");
        System.out.println("==================================================");
        System.out.println();

        // Continuous loop
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().trim();

            // Handle empty input
            if (userInput.isEmpty()) {
                System.out.println("Bot: Please type something!\n");
                continue;
            }

            String response = getResponse(userInput);

            // Check for exit
            if (response.equals("EXIT")) {
                System.out.println("Bot: Goodbye! Keep learning and building - you're doing great!");
                System.out.println("     See you next time at Decode Labs!");
                break;
            }

            System.out.println("Bot: " + response);
            System.out.println();
        }

        scanner.close();
    }
}
