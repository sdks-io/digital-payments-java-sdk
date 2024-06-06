
# Mpp Error

## Structure

`MppError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Optional | Descriptive, human readable error message. Description of the error (e.g. This field is required and must to be between 1 and 255 characters long) | String getMessage() | setMessage(String message) |
| `Reason` | `String` | Optional | Additional classification specific for each error type e.g. 'noStock'. The nature of the issue (e.g. missing) | String getReason() | setReason(String reason) |
| `Subject` | `String` | Optional | Identifier of the related object e.g. '1'. The field/attribute with an issue (e.g. First Name) | String getSubject() | setSubject(String subject) |
| `SubjectType` | `String` | Optional | Type of the object related to the error e.g. 'entry'. The item it relates to (e.g. Parameter) | String getSubjectType() | setSubjectType(String subjectType) |
| `Type` | `String` | Optional | Type of the error e.g. 'LowStockError', 'Validation Error' | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "message": "message4",
  "reason": "reason8",
  "subject": "subject0",
  "subjectType": "subjectType8",
  "type": "type4"
}
```

