package com.msd.product.exception;

public class EmptyFieldException extends RuntimeException{

        private static final long serialVersionUID = 1L;

        public EmptyFieldException(String msg) {
                super(msg);
                
        }

}
