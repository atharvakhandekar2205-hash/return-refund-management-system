
package com.example.returnsystem.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ReturnRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private String category;
    private String reason;
    private double refundAmount;
    private double originalPrice;
    private double currentPrice;
    private boolean isDiscounted;
    private String qrCodeData;
    private LocalDate returnDate;

    // Getters and Setters omitted for brevity
}
