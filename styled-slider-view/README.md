### Gradle Integration

[![CircleCI](https://circleci.com/gh/SodaLabs/styled-views-android.svg?style=svg)](https://circleci.com/gh/SodaLabs/styled-views-android)
[ ![Download](https://api.bintray.com/packages/sodalabs/android/styled-slider-view/images/download.svg) ](https://bintray.com/sodalabs/android/styled-slider-view/_latestVersion)

Add this into your dependencies block.

```
implementation 'co.sodalabs:styled-slider-view:x.x.x'
```

If you cannot find the package on JCenter, add this to your gradle repository

```
maven {
    url 'https://dl.bintray.com/sodalabs/android'
}
```

### StyledCutThumbSliderView

A slider that the thumb is cut by the shape of the track.

##### Styled attributes

- `app:thumbDrawable`: The thumb drawable.
- `app:trackForegroundDrawable`: The foreground track drawable.
- `app:trackBackgroundDrawable`: The track (a.k.a progress, but only the background part) drawable.
- `app:touchDragSlop`: A slop where the touch forms a drag if the move distance is over.

##### Preview

<p align="center">
  <img src="../docs/sl-cut-thumb-demo.gif" width="380">
</p>

##### XML Sample

```XML
<co.sodalabs.view.StyledCutThumbSliderView
    ...
    android:progress="50"
    app:thumbDrawable="@drawable/default_slider_thumb"
    app:trackBackgroundDrawable="@drawable/default_slider_background_track"
    app:trackForegroundDrawable="@drawable/default_slider_foreground_track" />
```

---

### StyledMarkerView

A discrete slider with drawable marker customization.

> Note: The slider has a minimum height **21 dip**.

##### Styled attributes

- `app:thumbDrawable`: The thumb drawable.
- `app:trackBackgroundDrawable`: The track (a.k.a progress, but only the background part) drawable.
- `app:markerDrawableMiddle`: The marker (tick) drawable in the middle.
- `app:markerDrawableStart`: The marker (tick) drawable at the start.
- `app:markerDrawableEnd`: The marker (tick) drawable at the end.
- `app:markerNum`: The amount of markers on the track. The markers are distributed evenly spaced.
- `app:touchDragSlop`: A slop where the touch forms a drag if the move distance is over.

##### Preview

<p align="center">
  <img src="../docs/sl-marker-demo.gif" width="380">
</p>

##### XML Sample

```XML
<co.sodalabs.view.StyledMarkerSliderView
    ...
    android:progress="50"
    app:markerDrawableEnd="@drawable/default_marker_slider_marker_end"
    app:markerDrawableMiddle="@drawable/default_marker_slider_marker_middle"
    app:markerDrawableStart="@drawable/default_marker_slider_marker_start"
    app:markerNum="5"
    app:thumbDrawable="@drawable/default_slider_thumb"
    app:trackBackgroundDrawable="@drawable/default_slider_foreground_track" />
```


