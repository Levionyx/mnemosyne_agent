package com.griff.mnemosyne.core.model;

/**
 * 系统消息。
 */
public record UserMessage(String content) implements Message {

    @Override
    public String role() {
        return "user";
    }
}
