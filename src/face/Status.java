package face;

import java.time.LocalDateTime;

public class Status {
private LocalDateTime time;
private String text;

Status(){
	time=LocalDateTime.now();
}
Status(String text){
	time=LocalDateTime.now();
	this.text=text;
}
public LocalDateTime getTime() {
	return time;
}
public void setTime(LocalDateTime time) {
	this.time = time;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
}
