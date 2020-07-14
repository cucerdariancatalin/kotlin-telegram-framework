package io.cutebot.telegram.interaction.model

import io.cutebot.telegram.client.TelegramApi
import io.cutebot.telegram.interaction.model.action.ChatAnswerSendAction
import io.cutebot.telegram.interaction.model.message.ChatAnswerSendDocument
import io.cutebot.telegram.interaction.model.message.ChatAnswerSendPhoto
import io.cutebot.telegram.interaction.model.message.ChatAnswerSendText
import java.io.File


interface ChatAnswer {

    fun fireAction(api: TelegramApi, token: String, chatId: Long)

    companion object {
        fun noAnswer(): ChatAnswer {
            return ChatAnswerNothing()
        }

        fun text(text: String): ChatAnswer {
            return ChatAnswerSendText(text)
        }

        fun photo(file: File, caption: String = ""): ChatAnswer {
            return ChatAnswerSendPhoto(file, caption)
        }

        fun document(file: File, caption: String = ""): ChatAnswer {
            return ChatAnswerSendDocument(file, caption)
        }

        fun actionTextTyping(): ChatAnswer {
            return ChatAnswerSendAction.typing()
        }
        fun actionUploadPhoto(): ChatAnswerSendAction {
            return ChatAnswerSendAction.uploadPhoto()
        }
        fun actionRecordVideo(): ChatAnswerSendAction {
            return ChatAnswerSendAction.recordVideo()
        }
        fun actionUploadVideo(): ChatAnswerSendAction {
            return ChatAnswerSendAction.uploadVideo()
        }
        fun actionRecordAudio(): ChatAnswerSendAction {
            return ChatAnswerSendAction.recordAudio()
        }
        fun actionUploadAudio(): ChatAnswerSendAction {
            return ChatAnswerSendAction.uploadAudio()
        }
        fun actionUploadDocument(): ChatAnswerSendAction {
            return ChatAnswerSendAction.uploadDocument()
        }
        fun actionFindLocation(): ChatAnswerSendAction {
            return ChatAnswerSendAction.findLocation()
        }
        fun actionRecordVideoNote(): ChatAnswerSendAction {
            return ChatAnswerSendAction.recordVideoNote()
        }
        fun actionUploadVideoNote(): ChatAnswerSendAction {
            return ChatAnswerSendAction.uploadVideoNote()
        }
    }
}
