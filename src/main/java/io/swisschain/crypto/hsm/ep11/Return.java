package io.swisschain.crypto.hsm.ep11;

public enum Return {
  CKR_OK(0L),
  CKR_CANCEL(1L),
  CKR_HOST_MEMORY(2L),
  CKR_SLOT_ID_INVALID(3L),
  CKR_GENERAL_ERROR(5L),
  CKR_FUNCTION_FAILED(6L),
  CKR_ARGUMENTS_BAD(7L),
  CKR_NO_EVENT(8L),
  CKR_NEED_TO_CREATE_THREADS(9L),
  CKR_CANT_LOCK(10L),
  CKR_ATTRIBUTE_READ_ONLY(16L),
  CKR_ATTRIBUTE_SENSITIVE(17L),
  CKR_ATTRIBUTE_TYPE_INVALID(18L),
  CKR_ATTRIBUTE_VALUE_INVALID(19L),
  CKR_ACTION_PROHIBITED(27L),
  CKR_DATA_INVALID(32L),
  CKR_DATA_LEN_RANGE(33L),
  CKR_DEVICE_ERROR(48L),
  CKR_DEVICE_MEMORY(49L),
  CKR_DEVICE_REMOVED(50L),
  CKR_ENCRYPTED_DATA_INVALID(64L),
  CKR_ENCRYPTED_DATA_LEN_RANGE(65L),
  CKR_FUNCTION_CANCELED(80L),
  CKR_FUNCTION_NOT_PARALLEL(81L),
  CKR_FUNCTION_NOT_SUPPORTED(84L),
  CKR_KEY_HANDLE_INVALID(96L),
  CKR_KEY_SIZE_RANGE(98L),
  CKR_KEY_TYPE_INCONSISTENT(99L),
  CKR_KEY_NOT_NEEDED(100L),
  CKR_KEY_CHANGED(101L),
  CKR_KEY_NEEDED(102L),
  CKR_KEY_INDIGESTIBLE(103L),
  CKR_KEY_FUNCTION_NOT_PERMITTED(104L),
  CKR_KEY_NOT_WRAPPABLE(105L),
  CKR_KEY_UNEXTRACTABLE(106L),
  CKR_MECHANISM_INVALID(112L),
  CKR_MECHANISM_PARAM_INVALID(113L),
  CKR_OBJECT_HANDLE_INVALID(130L),
  CKR_OPERATION_ACTIVE(144L),
  CKR_OPERATION_NOT_INITIALIZED(145L),
  CKR_PIN_INCORRECT(160L),
  CKR_PIN_INVALID(161L),
  CKR_PIN_LEN_RANGE(162L),
  CKR_PIN_EXPIRED(163L),
  CKR_PIN_LOCKED(164L),
  CKR_SESSION_CLOSED(176L),
  CKR_SESSION_COUNT(177L),
  CKR_SESSION_HANDLE_INVALID(179L),
  CKR_SESSION_PARALLEL_NOT_SUPPORTED(180L),
  CKR_SESSION_READ_ONLY(181L),
  CKR_SESSION_EXISTS(182L),
  CKR_SESSION_READ_ONLY_EXISTS(183L),
  CKR_SESSION_READ_WRITE_SO_EXISTS(184L),
  CKR_SIGNATURE_INVALID(192L),
  CKR_SIGNATURE_LEN_RANGE(193L),
  CKR_TEMPLATE_INCOMPLETE(208L),
  CKR_TEMPLATE_INCONSISTENT(209L),
  CKR_TOKEN_NOT_PRESENT(224L),
  CKR_TOKEN_NOT_RECOGNIZED(225L),
  CKR_TOKEN_WRITE_PROTECTED(226L),
  CKR_UNWRAPPING_KEY_HANDLE_INVALID(240L),
  CKR_UNWRAPPING_KEY_SIZE_RANGE(241L),
  CKR_UNWRAPPING_KEY_TYPE_INCONSISTENT(242L),
  CKR_USER_ALREADY_LOGGED_IN(256L),
  CKR_USER_NOT_LOGGED_IN(257L),
  CKR_USER_PIN_NOT_INITIALIZED(258L),
  CKR_USER_TYPE_INVALID(259L),
  CKR_USER_ANOTHER_ALREADY_LOGGED_IN(260L),
  CKR_USER_TOO_MANY_TYPES(261L),
  CKR_WRAPPED_KEY_INVALID(272L),
  CKR_WRAPPED_KEY_LEN_RANGE(274L),
  CKR_WRAPPING_KEY_HANDLE_INVALID(275L),
  CKR_WRAPPING_KEY_SIZE_RANGE(276L),
  CKR_WRAPPING_KEY_TYPE_INCONSISTENT(277L),
  CKR_RANDOM_SEED_NOT_SUPPORTED(288L),
  CKR_RANDOM_NO_RNG(289L),
  CKR_DOMAIN_PARAMS_INVALID(304L),
  CKR_CURVE_NOT_SUPPORTED(320L),
  CKR_BUFFER_TOO_SMALL(336L),
  CKR_SAVED_STATE_INVALID(352L),
  CKR_INFORMATION_SENSITIVE(368L),
  CKR_STATE_UNSAVEABLE(384L),
  CKR_CRYPTOKI_NOT_INITIALIZED(400L),
  CKR_CRYPTOKI_ALREADY_INITIALIZED(401L),
  CKR_MUTEX_BAD(416L),
  CKR_MUTEX_NOT_LOCKED(417L),
  CKR_NEW_PIN_MODE(432L),
  CKR_NEXT_OTP(433L),
  CKR_EXCEEDED_MAX_ITERATIONS(448L),
  CKR_FIPS_SELF_TEST_FAILED(449L),
  CKR_LIBRARY_LOAD_FAILED(450L),
  CKR_PIN_TOO_WEAK(451L),
  CKR_PUBLIC_KEY_INVALID(452L),
  CKR_FUNCTION_REJECTED(512L),
  CKR_VENDOR_DEFINED(2147483648L),
  CKR_IBM_WKID_MISMATCH(2147549185L),
  CKR_IBM_INTERNAL_ERROR(2147549186L),
  CKR_IBM_TRANSPORT_ERROR(2147549187L),
  CKR_IBM_BLOB_ERROR(2147549188L),
  CKR_IBM_BLOBKEY_CONFLICT(2147549189L),
  CKR_IBM_MODE_CONFLICT(2147549190L),
  CKR_IBM_NONCRT_KEY_SIZE(2147549192L),
  CKR_IBM_WK_NOT_INITIALIZED(2147549193L),
  CKR_IBM_OA_API_ERROR(2147549194L),
  CKR_IBM_REQ_TIMEOUT(2147549195L),
  CKR_IBM_READONLY(2147549196L),
  CKR_IBM_STATIC_POLICY(2147549197L),
  CKR_IBM_EMBED_CODE(2147549198L),
  CKR_IBM_EMBED_GENERIC(2147549199L),
  CKR_IBM_TRANSPORT_LIMIT(2147549200L),
  CKR_IBM_FCV_NOT_SET(2147549201L),
  CKR_VENDOR_DEFINED_GREP11(2147745792L),
  CKR_IBM_GREP11_NOT_AUTHENTICATED(2147745793L),
  CKR_IBM_GREP11_CANNOT_UNMARSHAL(2147745794L),
  CKR_IBM_GREP11_CANNOT_MARSHAL(2147745795L),
  CKR_IBM_GREP11_CONFLICT(2147745796L),
  CKR_IBM_GREP11_DBINTERNAL(2147745797L),
  CKR_IBM_GREP11_SERVER_INTERNAL(2147745798L);

  public Long value;

  Return(Long value) {
    this.value = value;
  }
}
