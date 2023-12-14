package net.youtube.springboot.helper;

import net.youtube.springboot.exceptions.ErrorDetails;
import net.youtube.springboot.exceptions.RecordNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RecordNotFoundHandler {

    // Exception handling scenario
    @ExceptionHandler(value = RecordNotFoundException.class)
    public String handleException(RecordNotFoundException recordNotFoundException,
                                  Model model) {

        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setStatus(456);
        errorDetails.setMessage(recordNotFoundException.getMessage());
        errorDetails.setTimestamp(System.currentTimeMillis());

//        model.addAttribute("status",errorDetails.getStatus());
//        model.addAttribute("message",errorDetails.getMessage());
//        model.addAttribute("timestamp",errorDetails.getTimestamp());
        model.addAttribute("exception", errorDetails);
        return "errorpage";
    }
}
