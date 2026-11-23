package com.griff.mnemosyne.core.model;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 对话上下文。
 * 负责维护一次对话中的完整消息历史。
 */
public class Conversation {

    /**
     * 对话唯一标识
     */
    private final String id;

    /**
     * 消息历史
     */
    private final List<Message> messages;

    public Conversation() {
        this.id = UUID.randomUUID().toString();
        this.messages = new ArrayList<>();
    }

    public Conversation(String id) {
        this.id = id;
        this.messages = new ArrayList<>();
    }

    /**
     * 添加一条消息。
     */
    public void addMessage(Message message) {
        if (message == null) {
            throw new IllegalArgumentException("消息内容不能为空");
        }

        messages.add(message);
    }

    /**
     * 批量添加消息。
     */
    public void addMessages(List<Message> messages) {
        if (messages == null || messages.isEmpty()) {
            return;
        }

        messages.forEach(this::addMessage);
    }

    /**
     * 获取消息历史。
     * 返回不可修改的视图，防止外部直接修改内部消息列表。
     */
    public List<Message> getMessages() {
        return List.copyOf(messages);
    }

    /**
     * 清空对话历史。
     */
    public void clear() {
        messages.clear();
    }

    /**
     * 获取消息数量。
     */
    public int size() {
        return messages.size();
    }

    public String getId() {
        return id;
    }
}
