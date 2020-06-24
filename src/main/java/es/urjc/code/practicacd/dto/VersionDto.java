package es.urjc.code.practicacd.dto;

public class VersionDto {

	private String version;
	private String status;
	
    public String getVersion() {
        return version;
    }

    public String getStatus() {
        return status;
    }

    public static final class Builder {

        private final VersionDto object;

        public Builder() {
            object = new VersionDto();
        }

        public Builder withVersion(String value) {
            object.version = value;
            return this;
        }

        public Builder withStatus(String value) {
            object.status = value;
            return this;
        }

        public VersionDto build() {
            return object;
        }

    }
}
