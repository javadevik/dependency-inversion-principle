package com.ua;

public interface EmailSender {
    /**
     * Send email to user
     * @param email to send
     */
    void sendTo(String email);
}
