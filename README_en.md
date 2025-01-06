### Prepared project
This project contains set of prepared elements related to "storing drivers data" area:
- Driver, LicenseInfo, and Document entities
- Views for drivers listing and editing, as well as for their licenses and documents.

### Task
In this homework assignment, you will need to add new attributes to the model that will be used to store data files, and maintain these attributes within the application's user interface.

#### 1. Driver photo
Storing, uploading and showing the photo using byte[] data type.

- Add to the Driver entity new attribute: name - photo, datatype - byte[].
- Add to DriverDetailView the necessary components for uploading photos, as well as for displaying uploaded photos.
– The upload field should limit allowed file extensions to PNG and JPG only.
- Image display component settings:
    - Place it to the right of the existing form.
    - Adjust the component size (maximum 300 X 300 pixels) and scaling mode.
    - (*) (Optional) hide the component if the photo has not yet been loaded or after deleting the photo.

**NOTE**. In a real production application, for storing files larger than 1000 bytes, the FileRef data type should be preferred over byte[] and is highly recommended.

#### 2. Driver documents
Storing, uploading and downloading driver documents (driver's license, insurance, passport, etc.) using the FileRef data type.

- Add to the Document entity new attribute: - name - file, data type - FileRef.
- Add to Document detail view new component for the file upload.
- Add new functionality to the internal driver details view table containing the documents themselves, for previewing and downloading documents.
  The task is achievable using Renderer.
    - Use JmixButton as returning component.
    - Link name - document's filename.
    - When a link button is clicked - initiates a preview of the document file in the browser or downloads it.
