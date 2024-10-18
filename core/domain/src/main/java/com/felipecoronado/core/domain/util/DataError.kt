package com.felipecoronado.core.domain.util

sealed interface DataError:Error {
    enum class Network:DataError{
        REQUEST_TIOMEOUT,
        UNAUTHORIZED,
        CONFLICT,
        TWO_MAY_REQUEST,
        NO_INTERNET,
        PAYLOAD_TOO_LARGE,
        SERVER_ERROR,
        UNKNOWN
    }

    enum class Local:DataError{
        DISK_FULL,

    }
}