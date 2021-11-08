package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerZeroStockException extends Exception {

    public BeerZeroStockException(Long id, int quantityToDecrement, int stockQuantity) {
        super(String.format("Beers with %s ID quantity to withdraw (%s) greater than what is in stock (%s)", id, quantityToDecrement, stockQuantity));
    }
}

