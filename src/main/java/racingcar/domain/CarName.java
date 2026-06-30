package racingcar.domain;

public class CarName {
    private static final int MAX_LENGTH = 5;
    private final String name;

    public CarName(String name){
        validate(name);
        this.name = name.trim();
    }

    private void validate(String name){
        if(name == null)
            throw new IllegalArgumentException("빈 이름은 불가능합니다.");
        else if(name.length() > MAX_LENGTH)
            throw new IllegalArgumentException("이름은 다섯 글자를 초과할 수 없습니다.");
    }

    public String getName(){
        return name;
    }
}
