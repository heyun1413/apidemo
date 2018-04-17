/**
 * 通用的网络应答器
 * @param <T>
 */
public class Response<T> {
    private static final int STATUS_SUCCESS = 0;
    private static final int STATUS_FAIL = -1;


    private final int status;
    private final String message;
    private final T result;

    private Response(int status, String message, T result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getResult() {
        return result;
    }

    public static <T> Response<T> success(String msg, T result) {
        return new Response<>(STATUS_SUCCESS, msg, result);
    }

    public static <T> Response<T> fail(String msg, T result) {
        return new Response<>(STATUS_FAIL, msg, result);
    }
}
