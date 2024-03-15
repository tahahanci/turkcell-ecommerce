package com.tahahanci.turkcell_ecommerce.core.services.abstracts;

public interface MessageService
{
    String getMessage(String key);
    String getMessageWithArgs(String key, Object... args);
}
