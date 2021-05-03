package Configuration;


public class CreateTestngFile {
/*
    public static void main(String[] args) {
        Map<String, Object> context = new HashMap<>();
        String includeGroup = args[0];
        context.put("includeGroup", includeGroup);//seleniu,api
        String testNgTemplatePath = System.getProperty("user.dir") + "/src/test/java/resource/template.xml";
        String testNgFile = renderTemplate(context, testNgTemplatePath);
        String testNGFileLocation = System.getProperty("user.dir") + "/src/test/java/resource/testng.xml";
        writeFile(testNgFile, testNGFileLocation);
    }
    private static String renderTemplate(Map<String, Object> context, String path) {
        Jinjava jinjava = new Jinjava();
        String renderedTemplate = "";
        try {
            File file = new File(path);
            String template = FileUtils.readFileToString(file);
            renderedTemplate = jinjava.render(template, context);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return renderedTemplate;
    }
    private static void writeFile(String renderedTemplate, String fileName) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            out.write(renderedTemplate);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 */
}
