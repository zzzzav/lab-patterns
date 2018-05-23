package ru.zvarko.pattern.behavioral.chain_resp;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilterImpl implements FilterChain {

    private FilterChain next;
    private Function<String, String> function;

    public FilterImpl(Function<String, String> function) {
        this.function = function;
    }

    @Override
    public Collection<String> apply(Collection<String> collection) {
        List<String> result = collection.stream().map(function::apply)
                .collect(Collectors.toList());
        collection = result;
        if (next != null) {
            return next.apply(collection);
        } else {
            return result;
        }
    }

    @Override
    public void setNext(FilterChain next) {
        this.next = next;
    }

}
