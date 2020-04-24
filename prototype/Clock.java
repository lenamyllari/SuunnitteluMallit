package prototype;

public interface Clock{
    int getHours();
    int getMinutes();
    int getSeconds();
    void setHours(int value);
    void setMinutes(int value);
    void setSeconds(int value);
    void tick();
	void getTime();
}
