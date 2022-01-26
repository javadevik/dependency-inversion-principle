package com.ua;

public class ConfirmationGmailSender implements EmailSender {
    @Override
    public void sendTo(String email) {
        System.out.println("Send confirmation message to " + email);
    }
}
