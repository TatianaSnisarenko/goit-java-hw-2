//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class NameEncoderDecoder {
    public NameEncoderDecoder() {
    }

    public String encode(String name) {
        String codeName = name.replace("e", "1");
        codeName = codeName.replace("u", "2");
        codeName = codeName.replace("i", "3");
        codeName = codeName.replace("o", "4");
        codeName = codeName.replace("a", "5");
        return "NOTFORYOU" + codeName + "YESNOTFORYOU";
    }

    public String decode(String name) {
        String decodeName = name.replace("YESNOTFORYOU", "");
        decodeName = decodeName.replace("NOTFORYOU", "");
        decodeName = decodeName.replace("1", "e");
        decodeName = decodeName.replace("2", "u");
        decodeName = decodeName.replace("3", "i");
        decodeName = decodeName.replace("4", "o");
        decodeName = decodeName.replace("5", "a");
        return decodeName;
    }

    public static void main(String[] args) {
        NameEncoderDecoder nameEncoderDecoder = new NameEncoderDecoder();
        String name = "Euioa";
        System.out.println(nameEncoderDecoder.encode(name));
        System.out.println(nameEncoderDecoder.decode(name));
    }
}
