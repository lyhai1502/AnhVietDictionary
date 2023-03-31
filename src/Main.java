public class Main {
    public static void main(String[] args) {
        Dictionary<String, String> englishToVietnamese = new Dictionary<>();
        ReadXMLFile readXMLFileAV = new ReadXMLFile("Anh_Viet.xml");
        readXMLFileAV.setComponents(englishToVietnamese);

        Dictionary<String, String> vietnameseToEnglish = new Dictionary<>();
        ReadXMLFile readXMLFileVA = new ReadXMLFile("Viet_Anh.xml");
        readXMLFileVA.setComponents(vietnameseToEnglish);

        new MainFrame(englishToVietnamese, vietnameseToEnglish);

//        // Lấy nghĩa của một từ từ từ điển
//        String helloMeaning = englishToVietnamese.get("hello");
//        System.out.println("Nghĩa của từ \"hello\": " + helloMeaning);
//
//        // Kiểm tra xem một từ có tồn tại trong từ điển hay không
//        boolean containsHello = englishToVietnamese.containsKey("hello");
//        System.out.println("Có từ \"hello\" trong từ điển: " + containsHello);
//
//        // Xóa một cặp từ-nghĩa khỏi từ điển
//        englishToVietnamese.remove("world");

        // In ra số lượng từ trong từ điển
        System.out.println("Số lượng từ trong từ điển: " + englishToVietnamese.size());
    }

}
