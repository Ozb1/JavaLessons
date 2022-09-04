package src.com.TrachMeSkill.Lesson17;

import java.util.regex.Pattern;
public class IpAdressValidService {
    private static final String IP_ADDRESS_PATTERN =
            "^([01]?\\d\\d?|[0-4]\\d|25[0-5])\\."
                    + "([01]?\\d\\d?|[0-4]\\d|25[0-5])\\."
                    + "([01]?\\d\\d?|[0-4]\\d|25[0-5])\\."
                    + "([01]?\\d\\d?|[0-4]\\d|25[0-5])$";
    private final Pattern pattern;

    public IpAdressValidService() {
        pattern = Pattern.compile(IP_ADDRESS_PATTERN);
    }

    public boolean validate(String ipAddress) {
        return pattern.matcher(ipAddress).matches();
    }
}