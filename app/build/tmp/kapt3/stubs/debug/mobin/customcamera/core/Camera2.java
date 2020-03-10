package mobin.customcamera.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 G2\u00020\u0001:\u0002GHB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010-\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0002J\u0006\u0010/\u001a\u00020&J\b\u00100\u001a\u00020&H\u0002J\b\u00101\u001a\u00020&H\u0002J\u0018\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u0012H\u0002J\b\u00105\u001a\u00020&H\u0002J\u0010\u00106\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u00107\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u0012H\u0002J\b\u00109\u001a\u00020&H\u0002J\u0006\u0010:\u001a\u00020&J\b\u0010;\u001a\u00020&H\u0002J\u0018\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0012H\u0002J\b\u0010?\u001a\u00020&H\u0002J\u000e\u0010@\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010A\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020!H\u0002J\u0018\u0010C\u001a\u00020&2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0012H\u0002J\u0006\u0010D\u001a\u00020&J\u001a\u0010E\u001a\u00020&2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J\b\u0010F\u001a\u00020&H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lmobin/customcamera/core/Camera2;", "", "activity", "Landroid/app/Activity;", "textureView", "Lmobin/customcamera/core/AutoFitTextureView;", "(Landroid/app/Activity;Lmobin/customcamera/core/AutoFitTextureView;)V", "backgroundHandler", "Landroid/os/Handler;", "backgroundThread", "Landroid/os/HandlerThread;", "cameraCaptureCallBack", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "cameraCaptureSession", "Landroid/hardware/camera2/CameraCaptureSession;", "cameraDevice", "Landroid/hardware/camera2/CameraDevice;", "cameraFacing", "", "cameraId", "", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "cameraState", "cameraStateCallback", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "captureRequest", "Landroid/hardware/camera2/CaptureRequest;", "captureRequestBuilder", "Landroid/hardware/camera2/CaptureRequest$Builder;", "flash", "Lmobin/customcamera/core/Camera2$FLASH;", "isFlashSupported", "", "mSensorOrientation", "onBitmapReady", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "previewSize", "Landroid/util/Size;", "surface", "Landroid/view/Surface;", "surfaceTextureListener", "Landroid/view/TextureView$SurfaceTextureListener;", "captureBitmap", "captureStillPicture", "close", "closeBackgroundThread", "closeCamera", "configureTransform", "viewWidth", "viewHeight", "createPreviewSession", "flashOn", "getOrientation", "rotation", "lockPreview", "onResume", "openBackgroundThread", "openCamera", "width", "height", "runPrecaptureSequence", "setFlash", "setFlashMode", "trigger", "setUpCameraOutputs", "switchCamera", "takePhoto", "unlockPreview", "Companion", "FLASH", "app_debug"})
public final class Camera2 {
    private kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onBitmapReady;
    private final android.hardware.camera2.CameraManager cameraManager = null;
    private int cameraFacing;
    private android.util.Size previewSize;
    private java.lang.String cameraId;
    private android.os.Handler backgroundHandler;
    private android.os.HandlerThread backgroundThread;
    private android.hardware.camera2.CameraDevice cameraDevice;
    private android.hardware.camera2.CameraCaptureSession cameraCaptureSession;
    private android.hardware.camera2.CaptureRequest.Builder captureRequestBuilder;
    private android.hardware.camera2.CaptureRequest captureRequest;
    private mobin.customcamera.core.Camera2.FLASH flash;
    private int cameraState;
    private android.view.Surface surface;
    
    /**
     * Whether the current camera device supports Flash or not.
     */
    private boolean isFlashSupported;
    
    /**
     * Orientation of the camera sensor
     */
    private int mSensorOrientation;
    private final android.hardware.camera2.CameraCaptureSession.CaptureCallback cameraCaptureCallBack = null;
    private final android.view.TextureView.SurfaceTextureListener surfaceTextureListener = null;
    private final android.hardware.camera2.CameraDevice.StateCallback cameraStateCallback = null;
    private final android.app.Activity activity = null;
    private final mobin.customcamera.core.AutoFitTextureView textureView = null;
    private static final int STATE_PREVIEW = 0;
    private static final int STATE_WAITING_LOCK = 1;
    private static final int STATE_WAITING_PRECAPTURE = 2;
    private static final int STATE_WAITING_NON_PRECAPTURE = 3;
    private static final int STATE_PICTURE_TAKEN = 4;
    private static final android.util.SparseIntArray ORIENTATIONS = null;
    
    /**
     * Max preview width that is guaranteed by Camera2 API
     */
    private static final int MAX_PREVIEW_WIDTH = 1920;
    
    /**
     * Max preview height that is guaranteed by Camera2 API
     */
    private static final int MAX_PREVIEW_HEIGHT = 1080;
    private static final java.util.Comparator<android.util.Size> compareSizesByArea = null;
    public static final mobin.customcamera.core.Camera2.Companion Companion = null;
    
    public final void onResume() {
    }
    
    public final void close() {
    }
    
    private final void closeCamera() {
    }
    
    private final void closeBackgroundThread() {
    }
    
    private final void openCamera(int width, int height) {
    }
    
    /**
     * Sets up member variables related to camera.
     *
     * @param width  The width of available size for camera preview
     * @param height The height of available size for camera preview
     */
    private final void setUpCameraOutputs(int width, int height) {
    }
    
    /**
     * Configures the necessary [android.graphics.Matrix] transformation to `mTextureView`.
     * This method should be called after the camera preview size is determined in
     * setUpCameraOutputs and also the size of `mTextureView` is fixed.
     *
     * @param viewWidth  The width of `mTextureView`
     * @param viewHeight The height of `mTextureView`
     */
    private final void configureTransform(int viewWidth, int viewHeight) {
    }
    
    /**
     * Retrieves the JPEG orientation from the specified screen rotation.
     *
     * @param rotation The screen rotation.
     * @return The JPEG orientation (one of 0, 90, 270, and 360)
     */
    private final int getOrientation(int rotation) {
        return 0;
    }
    
    private final void openBackgroundThread() {
    }
    
    private final void createPreviewSession() {
    }
    
    private final void flashOn(android.hardware.camera2.CaptureRequest.Builder captureRequestBuilder) {
    }
    
    private final void setFlashMode(android.hardware.camera2.CaptureRequest.Builder captureRequestBuilder, boolean trigger) {
    }
    
    private final void lockPreview() {
    }
    
    private final void unlockPreview() {
    }
    
    public final void switchCamera() {
    }
    
    public final void setFlash(@org.jetbrains.annotations.NotNull()
    mobin.customcamera.core.Camera2.FLASH flash) {
    }
    
    /**
     * Run the precapture sequence for capturing a still image. This method should be called when
     * we get a response in {@link #mCaptureCallback} from {@link #lockPreview()}.
     */
    private final void runPrecaptureSequence() {
    }
    
    private final void captureBitmap() {
    }
    
    /**
     * Capture a still picture. This method should be called when we get a response in
     * {@link #cameraCaptureCallback} from both {@link #lockPreview()}.
     */
    private final void captureStillPicture() {
    }
    
    public final void takePhoto(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onBitmapReady) {
    }
    
    public Camera2(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    mobin.customcamera.core.AutoFitTextureView textureView) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lmobin/customcamera/core/Camera2$FLASH;", "", "(Ljava/lang/String;I)V", "ON", "OFF", "AUTO", "app_debug"})
    public static enum FLASH {
        /*public static final*/ ON /* = new ON() */,
        /*public static final*/ OFF /* = new OFF() */,
        /*public static final*/ AUTO /* = new AUTO() */;
        
        FLASH() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JC\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0002\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lmobin/customcamera/core/Camera2$Companion;", "", "()V", "MAX_PREVIEW_HEIGHT", "", "MAX_PREVIEW_WIDTH", "ORIENTATIONS", "Landroid/util/SparseIntArray;", "STATE_PICTURE_TAKEN", "STATE_PREVIEW", "STATE_WAITING_LOCK", "STATE_WAITING_NON_PRECAPTURE", "STATE_WAITING_PRECAPTURE", "compareSizesByArea", "Ljava/util/Comparator;", "Landroid/util/Size;", "chooseOptimalSize", "choices", "", "textureViewWidth", "textureViewHeight", "maxWidth", "maxHeight", "aspectRatio", "([Landroid/util/Size;IIIILandroid/util/Size;)Landroid/util/Size;", "app_debug"})
    static final class Companion {
        
        /**
         * Given {@code choices} of {@code Size}s supported by a camera, choose the smallest one that
         * is at least as large as the respective texture view size, and that is at most as large as the
         * respective max size, and whose aspect ratio matches with the specified value. If such size
         * doesn't exist, choose the largest one that is at most as large as the respective max size,
         * and whose aspect ratio matches with the specified value.
         *
         * @param choices           The list of sizes that the camera supports for the intended output
         *                         class
         * @param textureViewWidth  The width of the texture view relative to sensor coordinate
         * @param textureViewHeight The height of the texture view relative to sensor coordinate
         * @param maxWidth          The maximum width that can be chosen
         * @param maxHeight         The maximum height that can be chosen
         * @param aspectRatio       The aspect ratio
         * @return The optimal {@code Size}, or an arbitrary one if none were big enough
         */
        private final android.util.Size chooseOptimalSize(android.util.Size[] choices, int textureViewWidth, int textureViewHeight, int maxWidth, int maxHeight, android.util.Size aspectRatio) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}