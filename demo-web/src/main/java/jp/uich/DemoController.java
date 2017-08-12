package jp.uich;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.Value;

@RestController
public class DemoController {

  @Value
  static class Result {
    private String message;
  }

  @GetMapping("/")
  public Result message(@RequestParam(required = false) String message) {
    return new Result(message);
  }
}
