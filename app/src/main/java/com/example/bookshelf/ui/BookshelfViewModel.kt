sealed interface BookshelfUiState {
    data class Success(val result: String) : BookshelfUiState
    object Loading : BookshelfUiState
    object Error : BookshelfUiState
}
