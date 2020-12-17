package first.test.a12171.utils;

public
interface InetCallBack<T> {
    void onSuccess(T t);
    void onFail(String error);
}
