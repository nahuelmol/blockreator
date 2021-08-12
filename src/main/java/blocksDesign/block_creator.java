class abstract Block_Factory(){
    public void get_block(geted){
        if (geted == "Golden Block"){
            return new GoldBlock()
        }if else (geted == "Silver block"){
            return new SilverBlock()
        }if else (geted == "Bronce Block"){
            return new BronceBlock()
        }else {
            return System.out.println("type not found")
        }
    }
}
