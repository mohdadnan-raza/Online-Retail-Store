package com.msd.product.exception;

public class DuplicateNotAllowedException extends RuntimeException{

        
        private static final long serialVersionUID = 1L;

        public DuplicateNotAllowedException(String message) {
                super(message);
                
        }

        

}