package com.code.softech.httputils

enum class HttpStatusCodes(var code: Int, var reason: String) {
    /**
     * Information purpose
     */
    CONTINUE(100, "Continue"),
    SWITCHING_PROTOCOL(101, "Switching protocol"),
    PROCESSING(102, "Processing"),
    EARLY_HINTS(103, "Early hints"),

    /**
     * Success
     */
    OK(200, "Ok"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NON_AUTHORITATIVE_INFO(203, "Non authoritative info"),
    NO_CONTENT(204, "No content"),
    RESET_CONTENT(205, "Reset content"),
    PARTIAL_CONTENT(206, "Partial content"),
    MULTI_STATUS(207, "Multi status"),
    ALREADY_REPORTED(208, "Already reported"),
    IM_USED(226, "I'm already used"),

    /**
     * Redirection
     * @author Jamie Omondi
     * @since 25-01-2023
     */
    MULTI_CHOICE(300, "Multi choice"),
    MOVED_PERMANENTLY(301, "Moved permanently"),
    FOUND(302, "Found"),
    SEE_OTHER(303, "see other"),
    NOT_MODIFIED(304, "Not modified"),
    USE_PROXY(305, "Use proxy"),
    NO_LONGER_USED(306, "No longer used"),
    TEMPORARY_REDIRECT(307, "Temporary redirect"),
    PERMANENT_REDIRECT(308, "Permanent redirect"),

    /**
     * Client Errors
     * @author Jamie Omondi
     * @since 25-01-2023
     *
     */
    BAD_REQUEST(400, "Bad request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not found"),
    METHOD_NOT_ALLOWED(405, "Method not allowed"),
    NOT_ACCEPTABLE(406, "Not acceptable"),
    PROXY_AUTHENTICATION_REQUIRED(407, "Proxy authentication required"),
    REQUEST_TIMEOUT(408, "Request timeout"),
    CONFLICT(409, "Conflict"),
    GONE(410, "Gone"),
    LENGTH_REQUIRED(411, "Length required"),
    PRECONDITION_FAILED(412, "Precondition failed"),
    PAYLOAD_TOO_LARGE(413, "Payload too large"),
    URI_TOO_LONG(414, "Uri too long"),
    UNSUPPORTED_MEDIA_FORMAT(415, "Unsupported media type"),
    RANGE_NOT_SATISFIABLE(416, "Range not satisfiable"),
    EXPECTATION_FAILED(417, "Expectation failed"),
    MISDIRECT_REQUEST(421, "Misdirect request"),
    UNPROCESSABLE_ENTRY(422, "Un-processable entry"),
    LOCKED(423, "Locked"),
    FAILED_DEPENDENCY(424, "Failed dependency"),
    TOO_EARLY(425, "Too early"),
    UPGRADE_REQUIRED(426, "Upgrade required"),
    PRECONDITION_REQUIRED(428, "Pre-condition required"),
    TOO_MANY_REQUESTS(429, "Too many requests"),
    REQ_HEADER_FIELD_TOO_LARGE(431, "Request header field too large"),
    UNAVAILABLE_FOR_LEGAL_REASONS(451, "Unavailable for legal reasons"),

    /**
     * Server errors
     * @author Jamie Omondi
     * @since 25-01-2023
     */
    INTERNAL_SERVER_ERROR(500, "Internal server error"),
    NOT_IMPLEMENTED(501, "Not implemented"),
    BAD_GATEWAY(502, "Bad gateway"),
    SERVICE_UNAVAILABLE(503, "Service unavailable"),
    GATEWAY_TIMEOUT(504, "Gateway timeout"),
    HTTP_VERSION_NOT_SUPPORTED(505, "HTTP version not supported"),
    INSUFFICIENT_STORAGE(507, "Insufficient storage"),
    LO0P_DETECTED(508, "Loop Detected"),
    NETWORK_AUTHENTICATION_REQUIRED(511, "Network authentication required"),
    AUTH_TOKEN_EXPIRED(543,"Auth token expired"),

    /**
     * Not defined
     * @author Jamie Omondi
     * @since 26-01-2023
     */
    NOT_DEFINED(600,"Not defined");


    override fun toString(): String {
        val map = HashMap<Any, Any>()
        map["code"] = code
        map["reason"] = reason
        return map.toString()
    }
}