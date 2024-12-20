

package com.example.mlprojects.content_recommendation.utils

/** Config for recommendation app.  */
class Config {
    /** TF Lite model path.  */
    var modelPath = DEFAULT_LOCAL_MODEL_PATH

    /** Number of input ids from the model.  */
    var inputLength = DEFAULT_INPUT_LENGTH

    /** Number of output length from the model.  */
    var outputLength = DEFAULT_OUTPUT_LENGTH

    /** Number of max results to show in the UI.  */
    var topK = DEFAULT_TOP_K

    /** Path to the movie list.  */
    var movieListPath = DEFAULT_MOVIE_LIST_PATH

    /** Id for padding.  */
    var pad = PAD_ID

    /** Output index for ID.  */
    var outputIdsIndex = DEFAULT_OUTPUT_IDS_INDEX

    /** Output index for score.  */
    var outputScoresIndex = DEFAULT_OUTPUT_SCORES_INDEX

    /** The number of favorite movies for users to choose from.  */
    var favoriteListSize = DEFAULT_FAVORITE_LIST_SIZE

    /** The name of the model in Firebase Console that is downloaded to the app */
    var remoteModelName = REMOTE_MODEL_NAME

    companion object {
        private const val DEFAULT_LOCAL_MODEL_PATH = "recommendation_cnn.tflite"
        private const val DEFAULT_MOVIE_LIST_PATH = "sorted_movie_vocab.json"
        private const val REMOTE_MODEL_NAME = "recommendations"
        private const val DEFAULT_INPUT_LENGTH = 10
        private const val DEFAULT_OUTPUT_LENGTH = 100
        private const val DEFAULT_TOP_K = 10
        private const val PAD_ID = 0
        private const val DEFAULT_OUTPUT_IDS_INDEX = 1
        private const val DEFAULT_OUTPUT_SCORES_INDEX = 0
        private const val DEFAULT_FAVORITE_LIST_SIZE = 100
    }
}
