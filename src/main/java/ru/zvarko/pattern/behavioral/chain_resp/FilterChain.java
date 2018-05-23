package ru.zvarko.pattern.behavioral.chain_resp;

import java.util.Collection;

public interface FilterChain {
    Collection<String> apply(Collection<String> collection);
    void setNext(FilterChain next);
}
