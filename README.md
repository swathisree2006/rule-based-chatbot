Rule-Based AI Chatbot — Decode Labs Internship Project 1


A simple rule-based chatbot built using Java, demonstrating core AI concepts like decision-making logic, control flow, and pattern-based response generation.




 Project Overview

This chatbot was created as Project 1 of the Decode Labs AI Internship in the domain of Artificial Intelligence.

It responds to predefined user inputs using if-else logic and runs in a continuous loop until the user exits.


 Key Requirements Met

RequirementStatusHandle greetings & exit commands 
Use if-else logic for responses
Run in a continuous loop


 Key Skills Demonstrated


Control Flow — Using while loops and if-else conditionals
Decision-Making Logic — Pattern matching user inputs to responses
Basic AI Concepts — Rule-based systems as a foundation for AI
Java Programming — Clean OOP design with Scanner and String methods



 Chatbot Topics


 Greetings and farewells
 AI, Machine Learning, Deep Learning explanations
 Java and Python programming info
 Decode Labs internship and project info
 Jokes and fun AI facts
 Current time and date
 Help menu



 How to Run

Prerequisites


Java JDK 8 or above installed


bash# 1. Clone the repository
git clone https://github.com/YOUR_USERNAME/rule-based-chatbot.git

# 2. Navigate into the folder
cd rule-based-chatbot

# 3. Compile the Java file
javac Chatbot.java

# 4. Run the chatbot
java Chatbot


 Sample Interaction

==================================================
        Welcome to DecodeBot!
   Decode Labs AI Internship - Project 1
==================================================
   Type 'help' for options  |  Type 'bye' to exit
==================================================

You: hello
Bot: Hello! I'm DecodeBot, your AI assistant. How can I help you today?

You: what is ai
Bot: Artificial Intelligence (AI) is the simulation of human intelligence by machines.
     It includes Machine Learning, Deep Learning, NLP, and Computer Vision.
     You are learning it right now at Decode Labs - great choice!

You: joke
Bot: Why do Java developers wear glasses?
     Because they don't C# ! Ha ha!

You: bye
Bot: Goodbye! Keep learning and building - you're doing great!
     See you next time at Decode Labs!


 Project Structure

rule-based-chatbot/
│
├── Chatbot.java     # Main chatbot source code
└── README.md        # Project documentation


 How It Works

javapublic static String getResponse(String userInput) {
    String input = userInput.toLowerCase().trim();

    if (input.equals("hello") || input.equals("hi")) {
        return "Hello! I'm DecodeBot!";
    }
    else if (input.contains("what is ai")) {
        return "AI is the simulation of human intelligence by machines!";
    }
    // ... more rules ...
    else {
        return "I didn't understand that. Type 'help' for options.";
    }
}

The main() method runs a while(true) loop to keep the chatbot running until the user types bye or exit.


 Author


Name: Swathisree C
Internship: Decode Labs — Artificial Intelligence
Project: Project 1 — Rule-Based AI Chatbot
