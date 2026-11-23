package com.griff.mnemosyne.core.model;

/**
 * 模型返回的工具调用
 *
 * @param id        工具调用唯一ID
 * @param name      工具名称
 * @param arguments 工具参数 JSON字符串
 */
public record ToolCall(String id, String name, String arguments) {

}
