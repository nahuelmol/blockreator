class interface Block(){
    void public color(){}
}

class GoldBlock implements Block(){
    @override
    void color(){
        return System.out.println("Gold color")
    }
}
class SilverBlock implements Block(){
    @override
    void color(){
        return System.out.println("Silver color")
    }
}
class BronceBlock implements Block(){
    @override
    void color(){
        return System.out.println("Bronce color")
    }
}
