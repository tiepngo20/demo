package api.demo.controllers.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseModel<T> {
    private boolean status;
    private T data;
}
