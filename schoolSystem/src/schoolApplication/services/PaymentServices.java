package schoolApplication.services;

import schoolApplication.models.Student;

import java.math.BigDecimal;

public interface PaymentServices {
    void processPayment(Student student, BigDecimal amount);
}
