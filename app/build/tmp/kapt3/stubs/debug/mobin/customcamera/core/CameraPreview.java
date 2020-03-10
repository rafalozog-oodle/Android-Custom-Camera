package mobin.customcamera.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J2\u0010\u0016\u001a\b\u0018\u00010\u0011R\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\b\u0012\u00060\u0011R\u00020\u0007\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0014J\u0006\u0010\u001e\u001a\u00020\rJ\b\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\u0006\u0010!\u001a\u00020\rJ\u001a\u0010\"\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ(\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0014H\u0016J\u0010\u0010)\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0016J\u0006\u0010+\u001a\u00020\rJ\u0006\u0010,\u001a\u00020\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lmobin/customcamera/core/CameraPreview;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "camera", "Landroid/hardware/Camera;", "cameraFront", "", "onPictureListener", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "pictureCallback", "Landroid/hardware/Camera$PictureCallback;", "previewSize", "Landroid/hardware/Camera$Size;", "chooseCamera", "findBackFacingCamera", "", "findFrontFacingCamera", "getOptimalPreviewSize", "sizes", "", "w", "h", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "pauseCamera", "refreshCamera", "releaseCamera", "resumeCamera", "setPictureListener", "surfaceChanged", "holder", "Landroid/view/SurfaceHolder;", "format", "width", "height", "surfaceCreated", "surfaceDestroyed", "switchCamera", "takePhoto", "app_debug"})
public final class CameraPreview extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {
    private kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onPictureListener;
    private final android.hardware.Camera.PictureCallback pictureCallback = null;
    private android.hardware.Camera camera;
    private boolean cameraFront;
    private android.hardware.Camera.Size previewSize;
    private java.util.HashMap _$_findViewCache;
    
    public final void setPictureListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onPictureListener) {
    }
    
    private final int findFrontFacingCamera() {
        return 0;
    }
    
    private final void refreshCamera() {
    }
    
    private final int findBackFacingCamera() {
        return 0;
    }
    
    @java.lang.Override()
    public void surfaceChanged(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder, int format, int width, int height) {
    }
    
    @java.lang.Override()
    public void surfaceDestroyed(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder) {
    }
    
    @java.lang.Override()
    public void surfaceCreated(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder) {
    }
    
    public final void switchCamera() {
    }
    
    public final void takePhoto() {
    }
    
    private final void chooseCamera() {
    }
    
    public final void pauseCamera() {
    }
    
    public final void resumeCamera() {
    }
    
    private final void releaseCamera() {
    }
    
    private final android.hardware.Camera.Size getOptimalPreviewSize(java.util.List<? extends android.hardware.Camera.Size> sizes, int w, int h) {
        return null;
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public CameraPreview(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}