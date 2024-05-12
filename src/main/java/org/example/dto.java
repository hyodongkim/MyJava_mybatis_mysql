package org.example;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class dto {
    private int id;
    private String name;
}