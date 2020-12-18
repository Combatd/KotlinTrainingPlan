// public void sendMessageToClient(
//     @Nullable Client client,
//     @Nullable String message,
//     @NotNull Mailer mailer
// ) {
//     if (client == null || message == null) return;

//     PersonalInfo personalInfo = client.getPersonalInfo();
//     if (personalInfo == null) return;

//     String email = personalInfo.getEmail();
//     if (email == null) return;

//     mailer.sendMessage(email, message);
// }

fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    val email = client?.personalInfo?.email // optional chaining
    if (email != null && message != null) { // always check that values exist
        mailer.sendMessage(email, message)
    }
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

// abstract class is an interface to be implemented
interface Mailer {
    fun sendMessage(email: String, message: String)
}