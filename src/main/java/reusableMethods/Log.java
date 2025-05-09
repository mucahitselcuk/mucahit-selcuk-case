package reusableMethods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    private static final Logger logger = LoggerFactory.getLogger(Log.class);

    // Bilgi mesajı
    public static void info(String message) {
        logger.info(message);
    }

    // Hata mesajı
    public static void error(String message) {
        logger.error(message);
    }
    public static void error(String message,InterruptedException e) {
        logger.error(message);
    }

    // Uyarı mesajı
    public static void warn(String message) {
        logger.warn(message);
    }

    // Debug mesajı
    public static void debug(String message) {
        logger.debug(message);
    }

    // Geçti mesajı (custom)
    public static void pass(String message) {
        logger.info("✅ PASS: {}", message);
    }

    // Başarısız mesajı (custom)
    public static void fail(String message) {
        logger.error("❌ FAIL: {}", message);
    }
}
