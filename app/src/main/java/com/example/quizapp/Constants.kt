package com.example.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "Identify the animal in the picture.",
            R.drawable.ic_dog_image,
            arrayListOf("Dog", "Lion", "Elephant", "Parrot"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "Identify the animal in the picture.",
            R.drawable.ic_cat_image,
            arrayListOf("Tiger", "Fox", "Cat", "Deer"),
            2
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "Which is the fruit in the picture?",
            R.drawable.ic_apple_image,
            arrayListOf("Okra", "Groundnuts", "Tomato", "Apple"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "What is the object in the picture?",
            R.drawable.ic_ship_image,
            arrayListOf("Stick", "Ship", "Table", "Boat"),
            1
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "What is the object in the picture?",
            R.drawable.ic_car_image,
            arrayListOf("Bike", "Helmet", "Car", "Home"),
            2
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "Identify the animal in the picture.",
            R.drawable.ic_kangaroo_image,
            arrayListOf("Kangaroo", "Panda", "Monkey", "none of these"),
            0
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            arrayListOf("Dominica", "Egypt", "Denmark", "Ethiopia"),
            2
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            arrayListOf("Ireland", "Iran", "Hungary", "India"),
            3
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            arrayListOf("Australia", "New Zealand", "Tuvalu", "United States of America"),
            1
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "Which fruit is thi?",
            R.drawable.ic_watermelon_image,
            arrayListOf("Watermelon", "Guava", "Strawberry", "Muskmelon"),
            0
        )
        questionsList.add(questionTen)

        return questionsList
    }
}