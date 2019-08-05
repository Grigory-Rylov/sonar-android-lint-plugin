package org.sonar.plugins.android.lint;

/**
 * Provides path to profile-android-lint.xml
 *
 * @author Grigory Rylov
 */
public class ProfileRepository {
    private static final String PROFILE_PATH = "ANDROID_LINT_PROFILE";

    /**
     * @return path to android lint configuration.
     */
    public String getLintProfilePath() {
        // try to read path from env $ANDROID_LINT_PROFILE
        if (System.getenv().containsKey(PROFILE_PATH)) {
            return System.getenv().get(PROFILE_PATH);
        }
        return "org/sonar/plugins/android/lint/profile-android-lint.xml";
    }
}
