package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {









 ; var rIGHTPOSITION =0;var wRONGPOSITION =0
    for(i in 0 until secret.length) {
        if (guess[i] in secret) {

            if (guess[i] == secret[i]) rIGHTPOSITION++
            else wRONGPOSITION++


        }

    }
    return Evaluation(rIGHTPOSITION, wRONGPOSITION)
}
