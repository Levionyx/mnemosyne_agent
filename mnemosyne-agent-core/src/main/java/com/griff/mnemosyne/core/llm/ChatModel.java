
package com.griff.mnemosyne.core.llm;

/**
 * 大语言模型调用抽象。
 *
 * Agent Core 通过该接口与不同的大语言模型通信，
 * 不关心底层使用 DeepSeek、OpenAI 还是其他模型。
 */
public interface ChatModel {

    /**
     * 同步调用大语言模型
     *
     * @param request 模型请求参数
     * @return 模型响应
     */
    ChatResponse chat(ChatRequest request);
}
