package com.code.softech.httputils

class HttpResponseStatus {
    /**
     * Information purpose
     */
    fun parse(code: Int): HttpStatusCodes {
        if (code < 0) return HttpStatusCodes.NOT_DEFINED
        return when (code) {
            100 -> HttpStatusCodes.CONTINUE
            101 -> HttpStatusCodes.SWITCHING_PROTOCOL
            102 -> HttpStatusCodes.PROCESSING
            103 -> HttpStatusCodes.EARLY_HINTS
            200 -> HttpStatusCodes.OK
            201 -> HttpStatusCodes.CREATED
            202 -> HttpStatusCodes.ACCEPTED
            203 -> HttpStatusCodes.NON_AUTHORITATIVE_INFO
            204 -> HttpStatusCodes.NO_CONTENT
            205 -> HttpStatusCodes.RESET_CONTENT
            206 -> HttpStatusCodes.PARTIAL_CONTENT
            207 -> HttpStatusCodes.MULTI_STATUS
            208 -> HttpStatusCodes.ALREADY_REPORTED
            226 -> HttpStatusCodes.IM_USED
            300 -> HttpStatusCodes.MULTI_CHOICE
            301 -> HttpStatusCodes.MOVED_PERMANENTLY
            302 -> HttpStatusCodes.FOUND
            303 -> HttpStatusCodes.SEE_OTHER
            304 -> HttpStatusCodes.NOT_MODIFIED
            305 -> HttpStatusCodes.USE_PROXY
            306 -> HttpStatusCodes.NO_LONGER_USED
            307 -> HttpStatusCodes.TEMPORARY_REDIRECT
            308 -> HttpStatusCodes.MOVED_PERMANENTLY
            400 -> HttpStatusCodes.BAD_REQUEST
            401 -> HttpStatusCodes.UNAUTHORIZED
            402 -> HttpStatusCodes.PAYMENT_REQUIRED
            403 -> HttpStatusCodes.FORBIDDEN
            405 -> HttpStatusCodes.METHOD_NOT_ALLOWED
            406 -> HttpStatusCodes.NOT_ACCEPTABLE
            407 -> HttpStatusCodes.PROXY_AUTHENTICATION_REQUIRED
            408 -> HttpStatusCodes.REQUEST_TIMEOUT
            409 -> HttpStatusCodes.CONFLICT
            410 -> HttpStatusCodes.GONE
            411 -> HttpStatusCodes.LENGTH_REQUIRED
            412 -> HttpStatusCodes.PRECONDITION_FAILED
            413 -> HttpStatusCodes.PAYLOAD_TOO_LARGE
            414 -> HttpStatusCodes.URI_TOO_LONG
            415 -> HttpStatusCodes.UNSUPPORTED_MEDIA_FORMAT
            416 -> HttpStatusCodes.RANGE_NOT_SATISFIABLE
            417 -> HttpStatusCodes.EXPECTATION_FAILED
            421 -> HttpStatusCodes.MISDIRECT_REQUEST
            422 -> HttpStatusCodes.UNPROCESSABLE_ENTRY
            423 -> HttpStatusCodes.LOCKED
            424 -> HttpStatusCodes.FAILED_DEPENDENCY
            425 -> HttpStatusCodes.TOO_EARLY
            426 -> HttpStatusCodes.UPGRADE_REQUIRED
            428 -> HttpStatusCodes.PRECONDITION_REQUIRED
            429 -> HttpStatusCodes.TOO_MANY_REQUESTS
            431 -> HttpStatusCodes.REQ_HEADER_FIELD_TOO_LARGE
            451 -> HttpStatusCodes.UNAVAILABLE_FOR_LEGAL_REASONS
            500 -> HttpStatusCodes.INTERNAL_SERVER_ERROR
            501 -> HttpStatusCodes.NOT_IMPLEMENTED
            502 -> HttpStatusCodes.BAD_GATEWAY
            503 -> HttpStatusCodes.SERVICE_UNAVAILABLE
            504 -> HttpStatusCodes.GATEWAY_TIMEOUT
            505 -> HttpStatusCodes.HTTP_VERSION_NOT_SUPPORTED
            507 -> HttpStatusCodes.INSUFFICIENT_STORAGE
            508 -> HttpStatusCodes.LO0P_DETECTED
            511 -> HttpStatusCodes.NETWORK_AUTHENTICATION_REQUIRED
            else -> HttpStatusCodes.NOT_DEFINED
        }
    }
}