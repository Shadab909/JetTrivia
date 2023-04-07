package com.android.jettrivia.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.android.jettrivia.component.Questions

@Composable
fun TriviaHome(viewModel : QuestionViewModel = hiltViewModel()) {
    Questions(viewModel)
}