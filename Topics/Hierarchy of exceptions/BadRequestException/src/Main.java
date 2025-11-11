// update the class
class BadRequestException extends Exception{
    String message;

    public BadRequestException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}